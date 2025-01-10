let escolha = prompt("Escolha um exercício/desafio para visualizar (1 a 13): ");

if (escolha == 1) {
    console.log("Seja bem vindo!");
}

else if (escolha == 2) {
    let nome1 = prompt("Escreva seu nome: ");
    console.log("Bem-vindo " + nome1 + "!")
}

else if (escolha == 3) {
    let nome2 = prompt("Escreva seu nome: ");
    alert("Bem-vindo " + nome2 + "!")
}

else if (escolha == 4) {
    let pergunta = prompt("Qual a linguagem de programação que você mais gosta?");
    console.log(pergunta);
}

else if (escolha == 5) {
    let primeiroValor1 = parseInt(Math.random() * 10 + 1);
    let primeiroValor2 = parseInt(Math.random() * 5 + 1);
    let primeiroResultado = primeiroValor1 + primeiroValor2;

    console.log("VALOR 1: " + primeiroValor1);
    console.log("VALOR 2: " + primeiroValor2);
    console.log("SOMA: " + primeiroResultado);
}

else if (escolha == 6) {
    let segundoValor1 = parseInt(Math.random() * 10 + 1);
    let segundoValor2 = parseInt(Math.random() * 9 + 1);
    let segundoResultado = segundoValor1 - segundoValor2;
    
    console.log("VALOR 1: " + segundoValor1);
    console.log("VALOR 2: " + segundoValor2);
    console.log("SOMA: " + segundoResultado);
}

else if (escolha == 7) {
    let idade = prompt("Digite a sua idade: ");
    let menorOuMaior = idade > 18 ? "maior " : "menor ";
    let resposta = "Você é " + menorOuMaior + "de idade."
    
    console.log(resposta);
}

else if (escolha == 8) {
    let numero = prompt("Digite um número: ");
    
    if (numero > 0) {
        alert("O número é positivo.")
    }
    
    else if (numero < 0) {
        alert("O número é negativo.")
    }
    
    else {
        alert("O número é zero.")
    }
}

else if (escolha == 9) {    
    let numero1 = 1;
    
    while (numero1 <= 10) {
        console.log(numero1);
        numero1++;
    } 
}

else if (escolha == 10) {    
    let nota = parseInt(Math.random() * 10);
    
    if (nota >= 7) {
        alert("APROVADO!");
    }
    
    else {
        alert("REPROVADO!");
    } 
}

else if (escolha == 11) {
    let numeroAleatorio = Math.random();
    alert("Número aleatório: " + numeroAleatorio);
}

else if (escolha == 12) {  
    let numeroAleatorio10 = parseInt(Math.random() * 10);
    alert("Número aleatório: " + numeroAleatorio10);
}

else if (escolha == 13) {
    let numeroAleatorio1000 = parseInt(Math.random() * 1000);
    alert("Número aleatório: " + numeroAleatorio1000);
}

else {
    alert("Ocorreu um erro. Tente novamente!");
}
