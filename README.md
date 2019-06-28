# CS441-Project-3

Objective: This is the third project of CS441. This project finds the best vacation idea base on user's input temperature!

This project has two activity page, one main activity which allows users to input their current temperature. There is two way to input temperature, either type the numerical number of temperature on one of the edit box Fahrenheit or Celcius or drag the seek bar.Edit one will change the other automatically.  A vacation button initials an Intent to the second activity with  Fahrenheit degree that users have inputted. Base on the temperature, there are in total of four images in response to different range of temperature. If the temperature is below 40 degrees of Fahrenheit, a snow image would pop up, is time for snowboarding!!! If the degree is between 40 to 70, hiking time! if it above 70 but below 100, beach time! Otherwise, the weather is too hot!!, open your AC, and stay at home! Besides pictures, a done button takes users back to the main activity. 

Some details:
Since I set the input type to TYPE_CLASS_NUMBER, Users are only allow to type in numercial value into degree edittexts.
Degree symbols would only be diplayed after users have inputed something.
Seekbar has min of 0 and max of 100 degree of Celsius. 


Time line:
6/16: Initial project, created github repository. 

6/17: Added project basic layout structures including seekbar,buttons,textviews.

6/19: Fixed some bugs base on the project requirements. Which including deleted a textview(I through the instruction textview should be included) Added two edittext for Farenheit and Celsius. Add functionality for eddittexts(Farenheit&Celcius)change accroding to seekBar. PS: Seekbar won't change accroding to eddittextinput, Textwatcher still has problem.

6:21: Added second activity and imageview, collect images for different weaters.

6:22: Round up result for Farenheit. Changed two edittext input type to number only.

6/24: Degree out put now change base on the other

6/26: Active the second activity, second activity now display farenheit as a result base on user's input.Second activity also display a image.A new button takes user back to the main activity page.

6/28: Added backcolor to every activities, added different images to response user's vacation request, images display on second activity based on user's input temperature. 


