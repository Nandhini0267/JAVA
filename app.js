import React, { useEffect, useState } from "react";
import axios from "axios";
import "./App.css"; // Add CSS for blinking effect

function App() {
  const [questions, setQuestions] = useState([]);
  const [currentQuestion, setCurrentQuestion] = useState(0);
  const [backgroundColor, setBackgroundColor] = useState("white");

  useEffect(() => {
    axios.get("http://localhost:5000/questions").then((response) => {
      setQuestions(response.data);
    });
  }, []);

  const handleAnswer = (answer) => {
    const isCorrect = answer === questions[currentQuestion].correctAnswer;
    setBackgroundColor(isCorrect ? "green" : "red");

    setTimeout(() => {
      setBackgroundColor("white");
      setCurrentQuestion((prev) => prev + 1);
    }, 500);
  };

  return (
    <div className="quiz-container" style={{ backgroundColor }}>
      {questions.length > 0 ? (
        <>
          <h2>{questions[currentQuestion].question}</h2>
          {questions[currentQuestion].options.map((option, index) => (
            <button key={index} onClick={() => handleAnswer(option)}>
              {option}
            </button>
          ))}
        </>
      ) : (
        <p>Loading questions...</p>
      )}
    </div>
  );
}

export default App;