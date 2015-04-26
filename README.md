# Quiz
PiJ Coursework 5 - A Quiz Game

by Annabel Jump for Programming in Java Coursework 5.

(Coursework not written yet, README will be updated to final instructional version once classes, interfaces etc written)

Classes:

SET-UP CLIENT:
	Keep simple (K.I.S.S.) as per CW spec - only have new quiz and end quiz in set-up client, all functionality in square brackets should be in separate class.
    Should be a quiz close method to end the quiz.
  
PLAYER CLIENT:
  See list of quizzes to choose one - include descriptor/title field in server quiz lists with IDs.
  Record player answers, keep counter of score of correct answers and return at the end.
  
QUIZ GAME SERVER:
  Keep list of names of quizzes, with corresponding IDs (for retrieval of questions/answers) - able to send for display in player program.
  Keep quiz questions, answers, scores up to date.
  Potential concurrency issues with multiple players attempting same quiz.
  All quizzes should be available at once.
  {Potential extra functionality, if time: Track incorrect answers to give statistics to players/quizmasters}
  
PLAYER:
	Accepts names and IDs, records score(s).

QUESTION:
	Makes questions, assigns answers and indicates which is correct.
	
QUIZ:
	Creates quiz names & accepts IDs, creates and stores questions.
	Accepts scores and keeps track of high score.
