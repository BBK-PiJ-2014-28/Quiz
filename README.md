# Quiz
PiJ Coursework 5 - A Quiz Game

by Annabel Jump for Programming in Java Coursework 5.

(Coursework not written yet, README will be updated to final instructional version once classes, interfaces etc written)

Plan for executing coursework :-

SET-UP CLIENT program:
  Initialize arrays with unique IDs - two Arrays, one for questions and one for corresponding answers (should answers be ENUM? Multiple choice! Can ENUM be set by user?);
  Will be written to server as a list of the Arrays and will be assigned a unique ID.
  There should be a third array for player scores, which can be sorted into order of high-low scores (parameters name and questions answered correctly - counter).
  All Arrays to be sent to server in one list per quiz.
  Quizzes and results should be retrievable by their unique ID (should each quiz-list have the ID? Test different        implementations).
  Should be a quiz close method to end the quiz.
  
PLAYER CLIENT program:
  See list of quizzes to choose one - include descriptor/title field in server quiz lists with IDs.
  Record player answers, keep counter of score of correct answers and return at the end.
  First should ask player for name? To keep score - or at end of quiz?
  
QUIZ GAME SERVER:
  Keep list of names of quizzes, with corresponding IDs (for retrieval of questions/answers) - able to send for display in player program.
  Keep quiz questions, answers, scores up to date.
  Potential concurrency issues with multiple players attempting same quiz.
  All quizzes should be available at once.
  {Potential extra functionality, if time: Track incorrect answers to give statistics to players/quizmasters}
  
