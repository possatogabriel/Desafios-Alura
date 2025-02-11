let escolha = prompt("Escolha um exercício/desafio para visualizar (1 a 13): ");

if (escolha == 1) {
    // 1. Crie um programa que utilize o console.log para exibir uma mensagem de boas-vindas.
    
    console.log("(1) Seja bem vindo!");
}

else if (escolha == 2) {
    // 2. Crie uma variável chamada "nome" e atribua a ela o seu nome. Em seguida, utilize o console.log para exibir a mensagem "Olá, [seu nome]!" no console do navegador.
    
    let nome1 = prompt("(2) Escreva seu nome: ");
    console.log("(2) Olá, " + nome1 + "!")
}

else if (escolha == 3) {
    // 3. Crie uma variável chamada "nome" e atribua a ela o seu nome. Em seguida, utilize o alert para exibir a mensagem "Olá, [seu nome]!" .
    
    let nome2 = prompt("(3) Escreva seu nome: ");
    alert("(3) Olá, " + nome2 + "!")
}

else if (escolha == 4) {
    // 4. Utilize o prompt e faça a seguinte pergunta: Qual a linguagem de programação que você mais gosta?. Em seguida, armazene a resposta em uma variável e mostre no console do navegador.
    
    let pergunta = prompt("(4) Qual a linguagem de programação que você mais gosta?");
    console.log("(4) " + pergunta);
}

else if (escolha == 5) {
    // 5. Crie uma variável chamada "valor1" e outra chamada "valor2", atribuindo a elas valores numéricos de sua escolha. Em seguida, realize a soma desses dois valores e armazene o resultado em uma terceira variável chamada "resultado". Utilize o console.log para mostrar a mensagem "A soma de [valor1] e [valor2] é igual a [resultado]." no console.
    
    let primeiroValor1 = parseInt(Math.random() * 10 + 1);
    let primeiroValor2 = parseInt(Math.random() * 5 + 1);
    let primeiroResultado = primeiroValor1 + primeiroValor2;

    console.log("(5) VALOR 1: " + primeiroValor1);
    console.log("(5) VALOR 2: " + primeiroValor2);
    console.log("(5) SOMA: " + primeiroResultado);
}

else if (escolha == 6) {
    // 6. Crie uma variável chamada "valor1" e outra chamada "valor2", atribuindo a elas valores numéricos de sua escolha. Em seguida, realize a subtração desses dois valores e armazene o resultado em uma terceira variável chamada "resultado". Utilize o console.log para mostrar a mensagem "A diferença entre [valor1] e [valor2] é igual a [resultado]." no console.
    
    let segundoValor1 = parseInt(Math.random() * 10 + 1);
    let segundoValor2 = parseInt(Math.random() * 9 + 1);
    let segundoResultado = segundoValor1 - segundoValor2;
    
    console.log("(6) VALOR 1: " + segundoValor1);
    console.log("(6) VALOR 2: " + segundoValor2);
    console.log("(6) SOMA: " + segundoResultado);
}

else if (escolha == 7) {
    // 7. Peça ao usuário para inserir sua idade com prompt. Com base na idade inserida, utilize um if para verificar se a pessoa é maior ou menor de idade, exibindo uma mensagem apropriada no console.
    
    let idade = prompt("(7) Digite a sua idade: ");
    let menorOuMaior = idade > 18 ? "maior " : "menor ";
    let resposta = "(7) Você é " + menorOuMaior + "de idade."
    
    console.log(resposta);
}

else if (escolha == 8) {
    // 8. Crie uma variável "numero" e peça um valor com prompt verifique se é positivo, negativo ou zero. Use if-else para imprimir a respectiva mensagem.
    
    let numero = prompt("Digite um número: ");
    
    if (numero > 0) {
        alert("(8) O número é positivo.")
    }
    
    else if (numero < 0) {
        alert("(8) O número é negativo.")
    }
    
    else {
        alert("(8) O número é zero.")
    }
}

else if (escolha == 9) {
    // 9. Use um loop while para imprimir os números de 1 a 10 no console.
        
    let numero1 = 1;
    
    while (numero1 <= 10) {
        console.log("(9) " + numero1);
        numero1++;
    } 
}

else if (escolha == 10) {   
    // 10. Crie uma variável "nota" e atribua um valor numérico a ela. Use if-else para determinar se a nota é maior ou igual a 7 e exiba "Aprovado" ou "Reprovado" no console.
     
    let nota = parseInt(Math.random() * 10);
    
    if (nota >= 7) {
        alert("(10) APROVADO!");
    }
    
    else {
        alert("(10) REPROVADO!");
    } 
}

else if (escolha == 11) {
    // 11. Use o Math.random para gerar qualquer número aleatório e exiba esse número no console.
    
    let numeroAleatorio = Math.random();
    alert("(11) Número aleatório: " + numeroAleatorio);
}

else if (escolha == 12) {  
    // 12. Use o Math.random para gerar um número inteiro entre 1 e 10 e exiba esse número no console.
    
    let numeroAleatorio10 = parseInt(Math.random() * 10);
    alert("(12) Número aleatório: " + numeroAleatorio10);
}

else if (escolha == 13) {
    // 13. Use o Math.random para gerar um número inteiro entre 1 e 1000 e exiba esse número no console.
    
    let numeroAleatorio1000 = parseInt(Math.random() * 1000);
    alert("(13) Número aleatório: " + numeroAleatorio1000);
}

else {
    alert("Ocorreu um erro. Tente novamente!");
}
