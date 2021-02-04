# Game_Of_War
This is a Card Game called Game of War,
It will be played by two computer players,
The logic of the game is:-
  -A Deck of Card object is created and shuffled
  -This deck then distributed evenly between the players
  -now each player will draw a card
    -if value of player One card is greater than the value of player Two card then both cards will be added to player One's cards/hands
    -if value of player Two card is greater than the value of player One card then both cards will be added to player Two's cards/hands 
    -if value of both the players card is same then 5 5 cards are drawn from both the players hands and the value of the last drawn card is compared
     whichever player wins all the cards will be added to that player hand.
  -If any players cards reduced to 0 or a player unable to declare war(unable to draw 5 cards) then he will loose the game.
