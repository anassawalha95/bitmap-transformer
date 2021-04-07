# bitmap-transformer



### Introduction 

A java application that allows manipulating Bitmap `.bmp` images provided by the users from the command line and saves to the preferd directory 


### How to use it:

1. open the terminal 
2. type in 

`./gradlew run --args 'input output "transform"'`

**For example**

`./gradlew run --args 'eviltower.bmp newEviltower.png "Invert"'`

3. Navigate to the directory provided 


### The Bitmap transform values

1. `"Invert"`: to Invert the image colors 
2. `"Randomize"` : to make a random color for each pixile in the image 
3. `"Black And White"` : to change the Image to back and white colors
4. `"Pixilate"`: to make the image pixilized
5. `"Rotate Right"`
6. `"Rotate Left"`

**collaborator:**

1. Esraa Abu Hana
2. Salah Alawneh


### Resources

[Using BufferedImage](https://docs.oracle.com/javase/tutorial/2d/images/loadimage.html)

[Black And White images](https://himnickson.medium.com/converting-rgb-image-to-the-grayscale-image-in-java-9e1edc5bd6e7)

[Rotate Images](https://www.youtube.com/watch?v=RLHG1dR3TsI)
[Random Pixiles](https://dyclassroom.com/image-processing-project/how-to-create-a-random-pixel-image-in-java)