<%-- 
    Document   : PythonTest
    Created on : 27 May, 2023, 8:07:08 PM
    Author     : DELL
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
    <title>Python MCQ Test</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }

        #timer {
            text-align: right;
            font-size: 20px;
        }

        #questions {
            margin-top: 20px;
        }

        .question {
            margin-bottom: 10px;
        }

        .options label {
            display: block;
            margin-bottom: 5px;
        }

        #submit-btn {
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <form action="PythonTest" method="POST">
    <div id="timer"></div>

    <div id="questions">
        <div class="question">
            <p>1. What is the output of the following Java code snippet?</p>
            <pre>
                public class Main {
                    public static void main(String[] args) {
                        int x = 5;
                        int y = 2;
                        System.out.println(x / y);
                    }
                }
            </pre>
            <div class="options">
                <label><input type="radio" name="q1" value="a"> 2</label>
                <label><input type="radio" name="q1" value="b"> 2.5</label>
                <label><input type="radio" name="q1" value="c"> 2.0</label>
                <label><input type="radio" name="q1" value="d"> 5</label>
            </div>
        </div>

        <div class="question">
            <p>2. Which of the following is not a Java keyword?</p>
            <div class="options">
                <label><input type="radio" name="q2" value="a"> int</label>
                <label><input type="radio" name="q2" value="b"> class</label>
                <label><input type="radio" name="q2" value="c"> boolean</label>
                <label><input type="radio" name="q2" value="d"> string</label>
            </div>
        </div>
        
        <div class="question">
            <p>3. Which of the following is a valid identifier in Java?</p>
            <div class="options">
                <label><input type="radio" name="q3" value="a"> 123abc</label>
                <label><input type="radio" name="q3" value="b"> _abc</label>
                <label><input type="radio" name="q3" value="c"> $abc</label>
                <label><input type="radio" name="q3" value="d"> #abc</label>
            </div>
        </div>

        <div class="question">
            <p>4. What is the correct syntax to instantiate an object of the `MyClass` class?</p>
            <div class="options">
                <label><input type="radio" name="q4" value="a"> MyClass myObj = new MyClass();</label>
                <label><input type="radio" name="q4" value="b"> new MyClass myObj = MyClass();</label>
                <label><input type="radio" name="q4" value="c"> MyClass myObj = MyClass();</label>
                <label><input type="radio" name="q4" value="d"> new myObj = MyClass();</label>
            </div>
            </div>
        <div class="question">
            <p>5. What is the output of the following code?</p>
            <pre>
                int i = 0;
                while (i < 5) {
                    System.out.print(i + " ");
                    i++;
                }
            </pre>
            <div class="options">
                <label><input type="radio" name="q5" value="a"> 0 1 2 3 4</label>
                <label><input type="radio" name="q5" value="b"> 1 2 3 4 5</label>
                <label><input type="radio" name="q5" value="c"> 0 1 2 3</label>
                <label><input type="radio" name="q5" value="d"> 1 2 3 4</label>
            </div>
        </div>

        <div class="question">
            <p>6. Which of the following is a correct way to declare a constant in Java?</p>
            <div class="options">
                <label><input type="radio" name="q6" value="a"> final int MAX_VALUE = 100;</label>
                <label><input type="radio" name="q6" value="b"> const int MAX_VALUE = 100;</label>
                <label><input type="radio" name="q6" value="c"> int MAX_VALUE = 100;</label>
                <label><input type="radio" name="q6" value="d"> static int MAX_VALUE = 100;</label>
            </div>
        </div>

        <div class="question">
            <p>7. What is the purpose of the `break` statement in Java?</p>
            <div class="options">
                <label><input type="radio" name="q7" value="a"> It terminates the program execution.</label>
                <label><input type="radio" name="q7" value="b"> It exits the current loop or switch statement.</label>
                <label><input type="radio" name="q7" value="c"> It skips the current iteration of a loop.</label>
                <label><input type="radio" name="q7" value="d"> It defines a label for a loop.</label>
            </div>
        </div>

        <div class="question">
            <p>8. What is the result of the following expression?</p>
            <pre>
                int x = 5;
                int y = x++;
                System.out.println(y);
            </pre>
            <div class="options">
                <label><input type="radio" name="q8" value="a"> 5</label>
                <label><input type="radio" name="q8" value="b"> 6</label>
                <label><input type="radio" name="q8" value="c"> 4</label>
                <label><input type="radio" name="q8" value="d"> 0</label>
            </div>
        </div>

       


        <!-- Add more questions here -->

        <input type="submit" value="Submit" name="Submit">
    </div>
</form>
    <script>
        // Timer countdown in seconds
         var score = 0;
        var timeLeft = 600; // 3 minutes
        var timer = document.getElementById("timer");

        function startTimer() {
            var minutes, seconds;
            var interval = setInterval(function() {
                minutes = parseInt(timeLeft / 60, 10);
                seconds = parseInt(timeLeft % 60, 10);

                minutes = minutes < 10 ? "0" + minutes : minutes;
                seconds = seconds < 10 ? "0" + seconds : seconds;

                timer.textContent = minutes + ":" + seconds;

                if (--timeLeft < 0) {
                    clearInterval(interval);
                    timer.textContent = "Time's up!";
                    submitTest();
                }
            }, 1000);
        }

        function submitTest() {
            // Calculate and display the score
           

            // Check answers for each question
            var q1Answer = document.querySelector('input[name="q1"]:checked');
            var q2Answer = document.querySelector('input[name="q2"]:checked');
            var q3Answer = document.querySelector('input[name="q3"]:checked');
            var q4Answer = document.querySelector('input[name="q4"]:checked');
            var q5Answer = document.querySelector('input[name="q5"]:checked');
            var q6Answer = document.querySelector('input[name="q6"]:checked');
            var q7Answer = document.querySelector('input[name="q7"]:checked');
            var q8Answer = document.querySelector('input[name="q8"]:checked');

            if (q1Answer && q1Answer.value === "c") {
                score += 1;
            }

            if (q2Answer && q2Answer.value === "d") {
                score += 1;
            }

            if (q3Answer && q3Answer.value === "b") {
                score += 1;
            }

            if (q4Answer && q4Answer.value === "a") {
                score += 1;
            }

            if (q5Answer && q5Answer.value === "a") {
                score += 1;
            }

            if (q6Answer && q6Answer.value === "a") {
                score += 1;
            }

            if (q7Answer && q7Answer.value === "b") {
                score += 1;
            }

            if (q8Answer && q8Answer.value === "a") {
                score += 1;
            }

        // Add more checks for other questions

        // Display the score
        alert("Your score is: " + score+"/10");

        // Optionally, you can redirect to another page or perform other actions after submission
        }
       
    // Start the timer when the page loads
    window.onload = function() {
        startTimer();
    };
       
   
</script>

