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
