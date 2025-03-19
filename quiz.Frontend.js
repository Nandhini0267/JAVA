import React, { useEffect, useState } from 'react';
import axios from 'axios';

const QuizApp = () => {
    const [questions, setQuestions] = useState([]);
    const [currentQuestion, setCurrentQuestion] = useState(0);
    const [score, setScore] = useState(0);
    const [showScore, setShowScore] = useState(false);

    useEffect(() => {
        axios.get('http://localhost:5000/questions')
            .then(response => setQuestions(response.data));
    }, []);

    const handleAnswer = (index) => {
        if (index === questions[currentQuestion].correctAnswer) {
            setScore(score + 1);
        }
        const nextQuestion = currentQuestion + 1;
        if (nextQuestion < questions.length) {
            setCurrentQuestion(nextQuestion);
        } else {
            setShowScore(true);
        }
    };

    return (
        <div>
            {showScore ? (
                <div>You scored {score} out of {questions.length}</div>
            ) : (
                <div>
                    <h2>{questions[currentQuestion]?.question}</h2>
                    {questions[currentQuestion]?.options.map((option, index) => (
                        <button key={index} onClick={() => handleAnswer(index)}>
                            {option}
                        </button>
                    ))}
                </div>
            )}
        </div>
    );
};

export default QuizApp;
