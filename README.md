# Tip Calculator Android Test App

### Note 01 : State and MutableState 
use the State and MutableState types in Compose to make state in your app observable, or tracked, by Compose. 
The State type is immutable, so you can only read the value in it, while the MutableState type is mutable. 
You can use the mutableStateOf() function to create an observable MutableState. 
It receives an initial value as a parameter that is wrapped in a State object, which then makes its value observable.


##
Use remember function to save state  
Composable methods can be called many times because of recomposition. 
The composable resets its state during recomposition if it's not saved.


Note: A stateless composable is a composable ​​that doesn't store its own state. It displays whatever state it's given as input arguments.


## Understand stateful versus stateless composables
You should hoist the state when you need to:

Share the state with multiple composable functions.
Create a stateless composable that can be reused in your app.


When you extract state from a composable function, the resulting composable function is called stateless. That is, composable functions can be made stateless by extracting state from them.

A stateless composable is a composable that doesn't have a state, meaning it doesn't hold, define, or modify a new state. On the other hand, a stateful composable is a composable that owns a piece of state that can change over time.


Note: 
In real apps, having a 100% stateless composable can be difficult to achieve depending on the composable's responsibilities. 
You should design your composables in a way that they will own as little state as possible and allow the state to be hoisted when it makes sense, by exposing it in the composable's API.






