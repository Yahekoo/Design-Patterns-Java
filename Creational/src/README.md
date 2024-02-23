# In this example

We have buttons that should be rendered according to the OS we're using ..
If we use Windows Os the button should be rendered (outputed) this way (square) :

+----------+
| Click Me |
+----------+

For a Mac Os (round) :

.-----------.
| Click Me! |
'-----------'

The Creation of these buttons will be through a method {createButton()} and not through the constructor .. This our the Factory Method

First we create the Products interface that will be implemented by objects to be created

Then we create an Abstract Class that will contain the abstract method (factory) = createButton() .. This class will be extended by two childs to provide the implementation of the factory Method ..

This way whenever we need an instance of Button ( Mac or Windows button ) we can call the method createButton() instead of calling the constructor directly (the thing that will result in tight coupling).

You can extend the application by adding a Linux Button and you'll see that it's gonna be easy , straightforward and won't break your existing classes
