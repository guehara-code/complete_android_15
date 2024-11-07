<?php

$conn = mysqli_connect("localhost", "root", "", "my_quiz_db", "3306");

$stmt = $conn->prepare("SELECT `question`,`option1`,`option2`,`option3`,`option4`,`correct_option` FROM `math_table`");

// execute query

$stmt->execute();

// Binding the result to the query
// when the prepared statement is executed, the values from the selected columns
// will be stored in these variables.

$stmt->bind_result($question, $option1, $option2, $option3, $option4, $correct_option);

// Creating an empty array
$questions_array = array();

// Traversing through all the questions
while($stmt->fetch()) {
    $temp = array();

    $temp['question'] = $question;
    $temp['option1'] = $option1;
    $temp['option2'] = $option2;
    $temp['option3'] = $option3;
    $temp['option4'] = $option4;
    $temp['correct_option'] = $correct_option;

    array_push($questions_array, $temp);
}

// Display the results in JSON format
echo json_encode($questions_array);


?>

