let escolha = prompt("Escolha um exercício/desafio para visualizar (1 a 4): ");

if (escolha == 1) {
    // 1. Crie um contador que comece em 1 e vá até 10 usando um loop while. Mostre cada número
    
    let i = 0;

    while (i < 11) {
        alert("(1) " + i);
        i++;
    }
}

else if (escolha == 2) {
    // 2. Crie um contador que começa em 10 e vá até 0 usando um loop while. Mostre cada número
    
    let y = 10;

    while (y >= 0) {
        alert("(2) " + y);
        y--;
    }
}

else if (escolha == 3) {
    // 3. Crie um programa de contagem regressiva. Peça um número e conte deste número até 0, usando um loop while no console do navegador
    
    let numero1 = prompt("(3) Escreva um número: ");
    
    while (numero1 >= 0) {
        alert("(3) " + numero1);
        numero1--;
    } 
}

else if (escolha == 4) { 
    // 4. Crie um programa de contagem progressiva. Peça um número e conte de 0 até esse número, usando um loop while no console do navegador
    
    let contagem2 = prompt("(4) Escreva um número: ");
    let numero2 = 0; 

    while (contagem2 >= numero2) {
        alert("(4) " + numero2);
        numero2++;
    }
}

else {
    alert("Ocorreu um erro. Tente novamente!");
}
