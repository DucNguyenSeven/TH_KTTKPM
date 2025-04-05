// app.js
const express = require('express');
const app = express();
const PORT = 3000;

app.get('/', (req, res) => {
  res.send('<h1>Hello from Node.js & Docker Compose - Nguyen Hong Duc</h1>');
});

app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});