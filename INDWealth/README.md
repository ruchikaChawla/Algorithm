There is a zoo and there are several groups(number of groups:K) of people for tour. Each group is having                   different size (g1,g2,g3…gK). There is one bus with capacity C. Journey starts from a point and bus will                  come back to the same point. A group can only be included in the bus if all the members of the groups                      can be accumulated in bus. After coming back from the tour, each group in the bus will again wait in the                     queue at the bus-stand. Bus-driver earns a rupee for each person travelled. You have to find the earning                  of the bus driver after R rounds. 
For example : 
Number of groups G = 4 
Group size for each group : 2 4 3 5 
Bus capacity : 7 
Number of rounds R : 4 
queue : (from front side) 2 4 3 5 
First round : 2 4 (we can’t take 3rd group as 3 members can’t be accumulated after 2 and 4.) 
queue : 3 5 2 4 (1st and 2nd group are enqueued. i.e. 2 and 4) 
Second round : 3 
queue : 5 2 4 3 
Third Round : 5 2 
queue : 4 3 5 2 
Fourth Round : 4 3 
After 4 rounds, total earning is 6+3+7+7 = 23. 