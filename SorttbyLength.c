#include <stdio.h>
#include <string.h>

void OrdenarFrase(char *partes[], int n);

int main() {
    int n;

    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        char frases[1000];

        scanf(" %[^\n]", frases);

        char *partes[100]; // Correção: tamanho fixo removido
        char *token = strtok(frases, " ");
        int count = 0;

        while (token != NULL) {
            partes[count++] = token;
            token = strtok(NULL, " ");
        }

        OrdenarFrase(partes, count); // Correção: passar o tamanho real do array

        for (int j = 0; j < count; j++) {
            printf("%s ", partes[j]);
        }

        printf("\n");
    }
}

void OrdenarFrase(char *partes[], int n) {
    for (int i = 0; i < n - 1; i++) {
        int maxIndex = i;

        for (int j = i + 1; j < n; j++) {
            if (strlen(partes[j]) > strlen(partes[maxIndex])) {
                maxIndex = j;
            }
        }

        char *temp = partes[maxIndex];
        partes[maxIndex] = partes[i];
        partes[i] = temp;
    }
}
