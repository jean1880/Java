<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>Sign In</title>
  <link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
  <h2>Sign In</h2>
  <p>Please sign in</p>
  <p>No Account? <a href="signUp">Get an Account</a></p>
  
<?php
require_once('connectvars.php');
$dbc= mysqli_connect(DB_HOST, DB_USER, DB_PASSWORD, DB_NAME);
$userName = trim($_POST['userName']);
$password = trim($_POST['password']);
 if(isset($_COOKIE['ID']))
 { 
    $userName = $_COOKIE['ID']; 
    $password = $_COOKIE['password'];
    $query = "SELECT password FROM users WHERE userName = '$userName'";

    while ($check = mysql_fetch_array($dbc,$query))
    {
        if($password == $check['password'])
        {
          // header("Location: index.php");
           echo 'worked1';
        }
        else
        {
             echo 'did not work1';
        }
    }         
 }
 
 if (isset($_POST['submit']))
 {
     if(!$_POST['userName'] || !$_POST['password'])
     {
        echo 'Please fill in all fields';      
     }
     
     $query2 = "SELECT password FROM users WHERE userName = '$userName' AND password = '$password'";
     if(mysqli_query($dbc,$query2))
     {
          setcookie(ID, $_POST['userName'], 60*60*24); 
          setcookie(pass, $_POST['password'], 60*60*24);	 
          //header("Location: index.php"); 
          echo 'worked2';
     }
     else
     {
       echo 'Username or password inncorrect';
     }   
     
      echo 'not working3';
 }
  echo 'not working4';
?>
  
  
  
<form id='login' enctype="text"action="<?php echo $_SERVER['PHP_SELF']; ?>" >
<label for="score">User Name</label>
<input type="text" id="userName" name="userName" maxlength="20" value="<?php if (!empty($userName)) echo $userName; ?>" /><br />
<label for="score">Password</label>
<input type="password" id="password" name="password" maxlength="20" value="<?php if (!empty($password)) echo $password; ?>" /><br />
<input type='submit' name='submit' value='Sign In' />
</form>