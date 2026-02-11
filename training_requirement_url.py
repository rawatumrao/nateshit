"""
Employee Training Requirement Analysis - URL Version

This script loads employee data from a URL and adds a 'Training' column
to indicate whether an employee needs training based on their rating.

Training Policy: Employees with rating <= 3.5 require training.
"""

import pandas as pd


# The file is stored at the following path:
# 'https://media-doselect.s3.amazonaws.com/generic/NMgEjwkAEGGQZBoNYGr9Ld7w0/rating.csv'
df = pd.read_csv('https://media-doselect.s3.amazonaws.com/generic/NMgEjwkAEGGQZBoNYGr9Ld7w0/rating.csv')

# Add the 'Training' column based on rating
# 'Yes' for rating <= 3.5, 'No' for rating > 3.5
df['Training'] = df['Rating'].apply(lambda x: 'Yes' if x <= 3.5 else 'No')

# Display the complete dataset with Training column
print("=" * 80)
print("Employee Training Requirement Analysis")
print("=" * 80)
print("\nComplete Employee Data with Training Requirements:")
print(df)

# Display summary statistics
print("\n" + "=" * 80)
print("Summary Statistics")
print("=" * 80)

print(f"\nTotal Employees: {len(df)}")
print(f"Employees requiring training (Rating <= 3.5): {(df['Training'] == 'Yes').sum()}")
print(f"Employees not requiring training (Rating > 3.5): {(df['Training'] == 'No').sum()}")

# Additional analysis if City and Department columns exist
if 'City' in df.columns:
    print("\n\nTraining Requirements by City:")
    print(df.groupby('City')['Training'].value_counts().unstack(fill_value=0))

if 'Department' in df.columns:
    print("\n\nTraining Requirements by Department:")
    print(df.groupby('Department')['Training'].value_counts().unstack(fill_value=0))

# Show rating distribution
print("\n\nRating Distribution:")
print(df['Rating'].describe())

# Save the processed data
output_file = 'employee_data_with_training_url.csv'
df.to_csv(output_file, index=False)
print(f"\n\nProcessed data saved to: {output_file}")
