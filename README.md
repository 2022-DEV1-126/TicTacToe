# TicTacToe
End points for the Application:
      1.POST :  /game/start
      2.POST :  /game/connect
      3.POST :  /game/gameplay
      4.POST :  /connect/random
      
# /game/start:
===============
    Creates the game with random gameId and here we are using only login about player

    Example RequestBody:
    -------------------
        {
          "login": "Venkey"
        }
        
            
    -->ResponseBody:
    ----------------
       {
          "gameId": "a889477c-a391-411d-9b7f-462207536a08",
          "player1": {
                      "login": "Venkey"
           },
          "player2": null,
          "status": "NEW",
          "board": [
            [
                0,
                0,
                0
            ],
            [
                0,
                0,
                0
            ],
            [
                0,
                0,
                0
            ]
            ],
          "winner": null
        }
        
# /game/connect:
================
    Used to connect second player to the game with gameId 

    Example RequestBody:
    -------------------
         {
            "player": {
                        "login": "Smith"
              },
             "gameId": "402d66d0-4043-402e-8a73-94da45b9e074"
          }
          
    -->ResponseBody:
    ----------------
          {
             "gameId": "402d66d0-4043-402e-8a73-94da45b9e074",
             "player1": {
                          "login": "Venkey"
              },
             "player2": {
                          "login": "Smith"
              },
             "status": "IN_PROGRESS",
              "board": [
                [
                    0,
                    0,
                    0
                ],
                [
                    0,
                    0,
                    0
                ],
                [
                    0,
                    0,
                    0
                ]
                ],
              "winner": null
            }
            
 # /game/gameplay:
 =================
    To play the game
    
    Example RequestBody:
    --------------------
        {
          "type": "X",
          "coordinateX": 2,
          "coordinateY": 1,
          "gameId": "402d66d0-4043-402e-8a73-94da45b9e074"
        }
        
    -->ResponseBody: (After multiple steps)
    ----------------
          {
            "gameId": "402d66d0-4043-402e-8a73-94da45b9e074",
            "player1": {
                          "login": "Venkey"
              },
            "player2": {
                          "login": "Smith"
              },
            "status": "FINISHED",
            "board": [
              [
                  0,
                  1,
                  2 
              ],
              [
                  0,
                  1,
                  2
              ],
              [
                  0,
                  1,
                  0
              ]
              ],
            "winner": "X"
          }    
    
    
