let escolha = prompt("Escolha um exercício/desafio para visualizar (1 a 5): ");

if (escolha == 1) {
    // 1. Pergunte ao usuário qual é o dia da semana. Se a resposta for "Sábado" ou "Domingo", mostre "Bom fim de semana!". Caso contrário, mostre "Boa semana!"
    
    let diaSemana = prompt("(1) Digite o dia da semana: ");
    
    let sabado = "Sábado";
    let domingo = "Domingo";

    // OR = ||
    if (diaSemana == "Sábado" || diaSemana == "Domingo") {
        alert("(1) Bom fim de semana! ");
    }

    else {
        alert("(1) Boa semana!");
    }
}

else if (escolha == 2) {
    // 2. Verifique se um número digitado pelo usuário é positivo ou negativo. Mostre um alerta informando
    
    let numero = prompt("(2) Escreva um número: ");
    
    if (numero >= 1) {
        alert("(2) Você escreveu um número positivo!");
    }

    else {
        alert("(2) Você escreveu um número negativo!");
    }
}

else if (escolha == 3) {
    // 3. Crie um sistema de pontuação para um jogo. Se a pontuação for maior ou igual a 100, mostre "Parabéns, você venceu!". Caso contrário, mostre "Tente novamente para ganhar."
    
    let pontos = prompt("(3) Escreva um número: ");
    
    if (pontos >= 100) {
        alert("(3) Parabéns, você venceu!");
    }

    else {
        alert("(3) Tente novamente para ganhar."); 
    }
}

else if (escolha == 4) {
    // 4. Crie uma mensagem que informa o usuário sobre o saldo da conta, usando uma template string para incluir o valor do saldo
    
    let saldo = 1000;
    alert("(4) O saldo atual da conta é: " + saldo);
}

else if (escolha == 5) {
    // 5. Peça ao usuário para inserir seu nome usando prompt. Em seguida, mostre um alerta de boas-vindas usando esse nome
    
    let nome = prompt("(5) Insira seu nome: ");
    alert("(5) Boas vindas " + nome + "!");
}

else {
    alert("Ocorreu um erro. Tente novamente!");
}