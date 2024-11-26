# syntax=docker/dockerfile:1
# Базовый образ
FROM node:alpine
# Рабочая директория
WORKDIR /app
# Копируем файл в рабочую директория
COPY package.json .
# Устанавливаем зависимости
RUN npm install
# Копируем файл в рабочую директория
COPY server.js .
# Порт на котором слушает сервер в контейнере
EXPOSE 3000
# Команда для запуска
CMD ["npm","start"]