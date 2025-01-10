let escolha = prompt("Escolha um exercício/desafio para visualizar (1 a 5): ");

if (escolha == 1) {
    let diaSemana = prompt("Digite o dia da semana: ");
    
    let sabado = "Sábado";
    let domingo = "Domingo";

    // OR = ||
    if (diaSemana == "Sábado" || diaSemana == "Domingo") {
        alert("Bom fim de semana! ");
    }

    else {
        alert("Boa semana!");
    }
}

else if (escolha == 2) {
    let numero = prompt("Escreva um número: ");
    
    if (numero >= 1) {
        alert("Você escreveu um número positivo!");
    }

    else {
        alert("Você escreveu um número negativo!");
    }
}

else if (escolha == 3) {
    let pontos = prompt("Escreva um número: ");
    
    if (pontos >= 100) {
        alert("Parabéns, você venceu!");
    }

    else {
        alert("Tente novamente para ganhar."); 
    }
}

else if (escolha == 4) {
    let saldo = 1000;
    alert("O saldo atual da conta é: " + saldo);
}

else if (escolha == 5) {
    let nome = prompt("Insira seu nome: ");
    alert("Boas vindas " + nome + "!");
}

else {
    alert("Ocorreu um erro. Tente novamente!");
}