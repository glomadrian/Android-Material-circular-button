Material Circular Button
------------------------

![enter image description here][1]


----------



#### Circular button for Android in Google Material Style

## How to use

Clone this proyect and import the module **"materialCircularButton"** in your project

Include the res-auto xmls definition in your parent layout

     xmlns:custom="http://schemas.android.com/apk/res-auto"

Then use Like Android ImageButton with two custom attributes:

    <com.glomadrian.button.MaterialButton
        android:id="@+id/materialButton"
        custom:color="#c3c3c3"
        custom:transitionTime="1200"
     />
## Android L Developers

Use the attribute elevation on Material Button to get the full Material Desing ([desing][2])

    <com.glomadrian.button.MaterialButton
        android:id="@+id/materialButton"
        custom:color="#c3c3c3"
        custom:transitionTime="1200"
        android:elevation="2dp"
     />

###TODO

Upload to maven central... 


  [1]: https://raw.githubusercontent.com/glomadrian/Material-circular-button/master/images/sample.gif
  [2]: http://www.google.com/design/spec/components/buttons.html#
