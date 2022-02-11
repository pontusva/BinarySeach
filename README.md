# Binary Search

Just a note: The reason I chose to work with such small array and small target value was because I wanted to understand what was going on. A linear search algorithm would be faster, in this case, because of the target number being the first number in the array.

Basically what happens is that we find the middle number of the array and if the target value is greater than the middle value we go to the right and if target is smaller we go to the left. This means that the array has to be sorted. 

The challange for me was to deduce what was happening in the else statement. If we look at the the code we see: right = mid;
Like alright? what's going on? 

What happens is that the right value becomes the mid value. That changes the value that we are using inside Math.floorDiv(). 

In the first iteration left+right divided by two is 1.5, then we floor that value and get 1. And because we set right to equal mid, the second iteration means that we have to add left + right again, but this time right is 1 divided by 2 which is 0.5 and then we floor it. On the third iteration the target is equal to the mid value so we return it. 

