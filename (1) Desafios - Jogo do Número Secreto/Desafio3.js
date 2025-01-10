let escolha = prompt("Escolha um exercício/desafio para visualizar (1 a 4): ");

if (escolha == 1) {
    let i = 0;

    while (i < 11) {
        alert(i);
        i++;
    }
}

else if (escolha == 2) {
    let y = 10;

    while (y >= 0) {
        alert(y);
        y--;
    }
}

else if (escolha == 3) {
    let numero1 = prompt("Escreva um número: ");
    
    while (numero1 >= 0) {
        alert(numero1);
        numero1--;
    } 
}

else if (escolha == 4) { 
    let contagem2 = prompt("Escreva um número: ");
    let numero2 = 0; 

    while (contagem2 >= numero2) {
        alert(numero2);
        numero2++;
    }
}

else {
    alert("Ocorreu um erro. Tente novamente!");
}
