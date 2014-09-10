1. File defects for the following issues, using the standard template discussed in class.

a. While testing a popular e-commerce site, you notice that adding the book "The Autobiography of a Cockatiel" to your cart always add two copies.  This second copy can be removed without fuss. 

b. While testing a video game, you find that pressing the B button causes your character to instantly die and restart the level, without losing a life.

c. You have discovered that your company's flagship spreadsheet program, Excelsior, contains a bug when calculating interest on dollar amounts.  It will always round down the number (e.g., simple annual interest at a rate of 6.7% on $1.00 will be calculated as $1.06 instead of rounded up to $1.07, as per the requirements).  You may safely ignore any possible parallels to popular movie schemes.

2. You are testing a bird-raising video game which has in-app purchases, where you can buy one of three additional birds to raise - a Baby Parakeet for $10.00, a Baby Conure for $20.00, or a Baby Cockatoo for $50.00.  Everybody is supposed to start with a free Baby Canary.  Users must log in to the app at least once a day, and do at least three things: feed their birds, give water to their birds, and pet their birds.  If a user does not do any one of these three things for three days in a row, the bird flies away to a more loving owner.

For each bug listed below, determine whether it is BLOCKER, CRITICAL, MAJOR, NORMAL, TRIVIAL, or ENHANCEMENT, and explain your reasoning.

a. Every purchase of a Baby Parakeet actually deducts $10.01 from the user's account.

b. A very small subset of users ( < 1% ) start out the game with two Baby Canaries instead of one.

c. Baby Cockatoos will not fly away unless you do not feed, water, or pet them for four days.

d. Users would like to raise Finches, not Canaries.

e. There is a typo on the help screen, with "the" misspelled as "teh".

3. For each of the following, determine whether the implementation of an absolute value function contains a defect, and write why or why not.  Remember that the absolute value function returns n * -1 if a negative number is entered, otherwise it just returns the same number that was passed in.

a.
```java
public int abs1(int n) {
  if (n < 0) {
    return -n;
  } else {
    return n;
  }  
}
```

b.
```java
public int abs2(int n) {
  if (n <= -1) {
    return n;
  } else {
    return -n;
  }
}
```

c.
```java
public int abs3(int n) {
  if (n < -100) {
    return -n;
  }
  if (n == 0) {
    return 0;
  }
  if (n < 0) {
    return -n;
  }
  return n;
}
```





