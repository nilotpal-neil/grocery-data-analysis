# grocery-data-analysis

The Groceries data set contains real-world point-of-sale transaction data from a typical local grocery outlet during a considered period. The data set contains 9835 transactions and the items are aggregated to 169 categories. These 169 attributes are all nominal in nature.
           Number of instances (tuples): 9835
           Number of attributes: 169 (all nominal).
The data within the set consists of attributes, which have Boolean (purchased - not purchased) values in the records organized by transactions.

DATASET DESCRIPTION

Data preparation tasks are likely to be performed multiple times and not in any prescribed order. Tasks include table, record, and attribute selection, as well as transformation and cleaning of data for modeling tools.
First of all we need to prepare data for modeling. This step has several phases. Initially we are provided with the grocery data in a comma separated file. Our objective is to convert this ‘.csv’ file to WEKA compatible ‘.arff’ format.
First task in data preparation is to extract unique attributes from the given historical data, which we achieved through Java programming construct. So for the given data set, 169 unique attributes are obtained.
Then data cleaning has to be performed to remove unwanted/redundant data.
Now for every instance in the data set, we are having 169 attributes, of which only those particular attributes have a true/ {t} value, that the customer has purchased. Rest of the attributes have a value false i.e. ‘?’.
So the final data set consists of description of each 169 attribute, followed by actual data description, which comprises of a tabular representation in the form of a 9835 X 169 matrix. 

For Grocery data analysis, Association Rule Mining is primarily used in this project, focusing on two important algorithms:
•	APRIORI Algorithm
•	FP Growth Algorithm

Association Rule Mining refers to finding frequent patterns, associations, correlations & casual structures among set of items/ objects in transaction databases, relational databases and information repositories.
