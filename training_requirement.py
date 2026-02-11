"""
Employee Training Requirement Analysis

This script loads employee data from a CSV file and adds a 'Training' column
to indicate whether an employee needs training based on their rating.

Training Policy: Employees with rating <= 3.5 require training.
"""

import pandas as pd
import sys


def load_and_process_data(csv_file='employee_data.csv'):
    """
    Load employee data from CSV and add Training column.
    
    Args:
        csv_file (str): Path to the CSV file containing employee data
        
    Returns:
        pandas.DataFrame: DataFrame with added 'Training' column
        
    Raises:
        FileNotFoundError: If the CSV file is not found
        ValueError: If the data is invalid or missing required columns
    """
    # Load the dataset with error handling
    try:
        df = pd.read_csv(csv_file)
    except FileNotFoundError:
        raise FileNotFoundError(
            f"Error: The file '{csv_file}' was not found.\n"
            f"Please ensure the employee data CSV file exists in the current directory."
        )
    except pd.errors.EmptyDataError:
        raise ValueError(
            f"Error: The file '{csv_file}' is empty.\n"
            f"Please provide a valid CSV file with employee data."
        )
    
    # Validate required columns
    if 'Rating' not in df.columns:
        raise ValueError(
            f"Error: The CSV file must contain a 'Rating' column.\n"
            f"Available columns: {', '.join(df.columns)}"
        )
    
    # Handle missing or invalid rating values
    if df['Rating'].isnull().any():
        print(f"Warning: Found {df['Rating'].isnull().sum()} rows with missing ratings. "
              f"These will be excluded from training assignment.", file=sys.stderr)
        df = df.dropna(subset=['Rating'])
    
    # Validate that ratings are numeric
    try:
        df['Rating'] = pd.to_numeric(df['Rating'], errors='raise')
    except ValueError:
        raise ValueError(
            f"Error: The 'Rating' column contains non-numeric values.\n"
            f"Please ensure all ratings are valid numbers."
        )
    
    # Add the 'Training' column based on rating
    # 'Yes' for rating <= 3.5, 'No' for rating > 3.5
    df['Training'] = df['Rating'].apply(lambda x: 'Yes' if x <= 3.5 else 'No')
    
    return df


def main():
    """Main function to demonstrate the training requirement analysis."""
    try:
        # Load and process the data
        df = load_and_process_data()
        
        # Display the results
        print("=" * 80)
        print("Employee Training Requirement Analysis")
        print("=" * 80)
        print("\nComplete Employee Data with Training Requirements:")
        print(df.to_string(index=False))
        
        # Display summary statistics
        print("\n" + "=" * 80)
        print("Summary Statistics")
        print("=" * 80)
        
        print(f"\nTotal Employees: {len(df)}")
        print(f"Employees requiring training: {(df['Training'] == 'Yes').sum()}")
        print(f"Employees not requiring training: {(df['Training'] == 'No').sum()}")
        
        # Summary by city
        print("\n\nTraining Requirements by City:")
        print(df.groupby('City')['Training'].value_counts().unstack(fill_value=0))
        
        # Summary by department
        print("\n\nTraining Requirements by Department:")
        print(df.groupby('Department')['Training'].value_counts().unstack(fill_value=0))
        
        # Save the processed data
        output_file = 'employee_data_with_training.csv'
        df.to_csv(output_file, index=False)
        print(f"\n\nProcessed data saved to: {output_file}")
        
    except (FileNotFoundError, ValueError) as e:
        print(f"\n{e}", file=sys.stderr)
        sys.exit(1)
    except Exception as e:
        print(f"\nUnexpected error: {e}", file=sys.stderr)
        sys.exit(1)


if __name__ == "__main__":
    main()
