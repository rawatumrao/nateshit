"""
Example: How to use training_requirement_url.py

This demonstrates the code structure and expected output.
Replace the URL with your actual data source.
"""

import numpy as np
import pandas as pd

print("=" * 80)
print("EXAMPLE: Employee Training Requirement Analysis from URL")
print("=" * 80)

print("\n1. BASIC CODE STRUCTURE:")
print("-" * 80)
print("""
import numpy as np
import pandas as pd

# Load data from URL
df = pd.read_csv('https://media-doselect.s3.amazonaws.com/generic/NMgEjwkAEGGQZBoNYGr9Ld7w0/rating.csv')

# Add Training column based on rating threshold (≤ 3.5)
df['Training'] = df['Rating'].apply(lambda x: 'Yes' if x <= 3.5 else 'No')

# Display the results
print(df)
""")

print("\n2. DEMONSTRATION WITH SAMPLE DATA:")
print("-" * 80)

# Create sample data similar to what might be in the URL
sample_data = {
    'Employee_ID': ['E001', 'E002', 'E003', 'E004', 'E005'],
    'Name': ['Rajesh Kumar', 'Priya Sharma', 'Amit Patel', 'Sneha Reddy', 'Vikram Singh'],
    'City': ['Mumbai', 'Bangalore', 'New Delhi', 'Mumbai', 'Bangalore'],
    'Department': ['Finance', 'HR', 'Marketing', 'Sales', 'Finance'],
    'Rating': [4.2, 3.8, 2.9, 4.5, 3.2]
}

df = pd.DataFrame(sample_data)

# Apply the training requirement logic
df['Training'] = df['Rating'].apply(lambda x: 'Yes' if x <= 3.5 else 'No')

print("\nSample DataFrame with Training Column:")
print(df)

print("\n\n3. ANALYSIS SUMMARY:")
print("-" * 80)
print(f"Total Employees: {len(df)}")
print(f"Employees requiring training (Rating ≤ 3.5): {(df['Training'] == 'Yes').sum()}")
print(f"Employees not requiring training (Rating > 3.5): {(df['Training'] == 'No').sum()}")

print("\n\n4. DETAILED BREAKDOWN:")
print("-" * 80)
for idx, row in df.iterrows():
    status = "NEEDS TRAINING" if row['Training'] == 'Yes' else "NO TRAINING NEEDED"
    print(f"{row['Employee_ID']} - {row['Name']:20s} | Rating: {row['Rating']} | {status}")

print("\n\n5. KEY POINTS:")
print("-" * 80)
print("• Training threshold: Rating ≤ 3.5 = 'Yes', Rating > 3.5 = 'No'")
print("• Lambda function applies the logic to each row")
print("• The 'Training' column is added to the existing DataFrame")
print("• Works with any CSV data source (local file or URL)")
print("\n" + "=" * 80)
