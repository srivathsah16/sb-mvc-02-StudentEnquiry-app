<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Student Enquiry App</title>
  </head>
  <body>
    <h1>Student Enquiry Form</h1>

    <form action="/student" method="post">
      Name: <input type="text" name="name" />
      <br />
      Email: <input type="email" name="email" />
      <br />
      Gender:<input type="radio" id="male" name="gender" value="Male" />
      <label for="gender">Male</label>
      <input type="radio" id="female" name="gender" value="Female" />
      <label for="gender">Fe-male</label><br />
      Courses: <br /><label for="cars">Choose a course:</label>

      <select name="course" id="course">
        <option value="${course.get(0).name}">${course.get(0).name}</option>
        <option value="${course.get(1).name}">${course.get(1).name}</option>
        <option value="${course.get(2).name}">${course.get(2).name}</option>
        <option value="${course.get(3).name}">${course.get(3).name}</option>
        <option value="${course.get(4).name}">${course.get(4).name}</option>
      </select>

      <br />

      Timings:
      <input type="checkbox" id="Morning" name="Morning" value="Morning" />
      <label for="Morning">${timings.get(0).value}</label>
      <input type="checkbox" id="Noon" name="Noon" value="Noon" />
      <label for="Noon"> ${timings.get(1).value}</label>
      <input type="checkbox" id="evening" name="evening" value="evening" />
      <label for="evening">${timings.get(2).value}</label><br /><br />

      <input type="submit" value="Submit" />
    </form>

    <br />
    <p>${message}</p>
  </body>
</html>
