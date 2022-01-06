## Objective: 
The objective of this challenge is to implement the levels of friendship in Java classes.

**Acquaintance**: A person who we know slightly but not a friend.

**Friend**: A person with whom we share a bond

**Best Friend**: A person with whom we share a strong bond

*As the levels of friendship increase, you get to know more about the person.*

*On the basis of knowledge you have about a person:* ***Best Friend > Friend > Acquaintance***

**Implement the below levels in terms of 3 Java classes :**

`Class Acquaintance`

-- Has an attribute: “name” (variable of type String)

-- Constructor: Acquaintance(String name)

-- Has a method public void getStatus which prints “[name] is just an acquaintance.\n”

`Class Friend`

-- Class Friend inherits class Acquaintance

-- Constructor: Friend(String name, String homeTown)

-- Has attribute “homeTown” (variable of type String) and Gender (variable of type boolean with value as Male and Feamale)

-- Has a method public void getStatus which prints “[name] is a friend and he/she is from [homeTown].\n”

**Note**: Based on the gender you should display he/she. if gender is Male, print "he" in the statement and if the gender is Female, print "she"

`Class BestFriend`

-- Class BestFriend inherits class Friend

-- Constructor: BestFriend(String name, String homeTown, String favoriteSong)

-- Has attribute “favoriteSong” (variable of type String) and Gender (variable of type boolean with value as Male and Feamale)

-- Has a method public void getStatus which prints “[name] is my best friend. He/She is from [homeTown] and his/her favorite song is [favoriteSong]."

**Note**: Based on the gender you should display he/she & his/her. if gender is Male, print "he" & "his" in the statement and if the gender is Female, print "she" & "her".