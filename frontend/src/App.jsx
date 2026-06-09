import { useState } from "react";

const App = () => {
  const [message, setMessage] = useState("");

  const loadMessage = async () => {
    const response = await fetch("http://localhost:8080/api/message");

    const data = await response.json();

    setMessage(data.text);
  };

  return (
    <>
      <button onClick={loadMessage}>Obtener mensaje</button>

      <h1>{message}</h1>
    </>
  );
};

export default App;
