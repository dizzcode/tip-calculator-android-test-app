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


##
Summary
State in an app is any value that can change over time.
The Composition is a description of the UI built by Compose when it executes composables. Compose apps call composable functions to transform data into UI.
Initial composition is a creation of the UI by Compose when it executes composable functions the first time.
Recomposition is the process of running the same composables again to update the tree when their data changes.
State hoisting is a pattern of moving state to its caller to make a component stateless.


##
@StringRes  
The @StringRes annotation is a type-safe way to use string resources. 
It indicates that the integer to be passed is a string resource from the values/strings.xml file.

##
## Write a local test
Ex: calculateTip() method is currently private and thus not accessible from the test. Remove the private designation and make it internal

add the @VisibleForTesting annotation:

@VisibleForTesting
internal fun calculateTip()

Summary
What automated tests are.
Why automated tests are important.
The difference between local tests and instrumentation tests
Fundamental best practices for writing automated tests.
Where to find and place local and instrumentation test classes in an Android project.
How to create a test method.
How to create local and instrumentation test classes.
How to make assertions in local and instrumentation tests.
How to use test rules.
How to use ComposeTestRule to launch the app with a test.
How to interact with composables in an instrumentation test.
How to run tests.





