import { Button, TextInput, Checkbox } from "./products";

export class DarkButton implements Button {
  render(): void {
    console.log("Renderizando botão ESCURO");
  }

  onClick(handler: () => void): void {
    console.log("Associando evento de clique ao botão ESCURO");
    handler();
  }
}

export class DarkTextInput implements TextInput {
  private value = "";

  render(): void {
    console.log(`Renderizando input ESCURO com valor: "${this.value}"`);
  }

  setValue(value: string): void {
    this.value = value;
  }
}

export class DarkCheckbox implements Checkbox {
  private checked = false;

  render(): void {
    console.log(`Renderizando checkbox ESCURO (${this.checked ? "marcado" : "desmarcado"})`);
  }

  check(): void {
    this.checked = true;
  }

  uncheck(): void {
    this.checked = false;
  }
}
