# Knapsack-Problem
You are given  𝑁 N items, each with a weight and value. You have a knapsack that can carry a maximum weight  𝑊 W. Your task is to determine the maximum value you can achieve by selecting items such that their total weight does not exceed  𝑊 W.
How It Works:
Input:
Number of items.
Knapsack capacity.
Weights and values of each item.
Dynamic Programming:
A 2D dp array is used where dp[i][w] represents the maximum value achievable with the first i items and capacity w.
If the item's weight exceeds the current capacity, it is excluded. Otherwise, the value is calculated by including or excluding the item.
Output: The maximum value that can be achieved.
