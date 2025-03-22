const http = require('http');

const server = http.createServer((req, res) => {
  res.end("Hello, Docker! I'm Duc");
});

server.listen(3000);