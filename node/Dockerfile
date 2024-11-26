FROM node:current-alpine

WORKDIR /app

COPY . .
RUN npm ci

EXPOSE 8000

CMD ["npm","start"]