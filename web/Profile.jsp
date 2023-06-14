<!DOCTYPE html>
<html>
<head>
  <title>Online Examination Signup</title>
  <style>
    body {
      font-family: Arial, sans-serif;
    }

    .container {
      max-width: 400px;
      margin: 0 auto;
      padding: 20px;
      border: 1px solid #ccc;
      border-radius: 5px;
      background-color: #f2f2f2;
    }

    .container h2 {
      text-align: center;
    }

    .container label {
      display: block;
      margin-bottom: 10px;
      font-weight: bold;
    }

    .container input[type="text"],
    .container input[type="email"],
    .container input[type="tel"],
    .container input[type="password"],
    .container select {
      width: 100%;
      padding: 10px;
      margin-bottom: 20px;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
    }

    .container input[type="radio"] {
      margin-bottom: 10px;
    }

    .container input[type="submit"] {
      background-color: #4CAF50;
      color: white;
      padding: 12px 20px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      width: 40%;
      margin-left: 20px;
    }
    #buttons{
        border: 1px solid;
        display: flex;
        border: none;
    }
    #edit{
        margin-left: 50px;
        background-color: #BD1313;
     
    }
  </style>
</head>
<body>
  <div class="container">
    <h2>Student Profile</h2>
    <form action="Profile" method="post">
      <label>PRN Number:</label>
      <input type="text" id="prn" name="prn" >

      <label>Name:</label>
      <input type="text" id="name" name="name" >

      <label>Mother's Name:</label>
      <input type="text" id="mother_name" name="moname" >

      <label>Email:</label>
      <input type="email" id="email" name="email" >

      <label>Contact No.:</label>
      <input type="tel" id="contact_no" name="contact" >

      <label>Gender:</label>
      <input type="radio" id="male" name="gender" value="male" >male
      <input type="radio" id="female" name="gender" value="female" >Female<br>
    <br>
      <label>Select exam:</label>
      <select id="subject" name="subject">
        <option value="" selected disabled>Select a Exam</option>
        <option value="pthon">Python MCQ Test</option>
        <option value="java">Java MCQ Test</option>
       
        <!-- Add more options if needed -->
      </select>

      <label>Address:</label>
      <input type="text" id="address" name="address" >
      <label>Username:</label>
      <input type="text" name="user" id="user" >
      <label>Password:</label>
      <input type="password" id="pass" name="pass">
      <br>
      <div id="buttons">
      <input type="submit" value="LaunchTest" name="signup">
      <input type="submit" value="Edit" id="edit">
      </div>
    </form>
  </div>
</body>
</html>