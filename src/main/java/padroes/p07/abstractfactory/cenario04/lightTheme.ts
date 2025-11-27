import { Button, TextInput, Checkbox } from "./products";

export class LightButton implements Button {
  render(): void {
    console.log("Renderizando botão CLARO");
  }

  onClick(handler: () => void): void {
    console.log("Associando evento de clique ao botão CLARO");
    handler();
  }
}

export class LightTextInput implements TextInput {
  private value = "";

  render(): void {
    console.log(`Renderizando input CLARO com valor: "${this.value}"`);
  }

  setValue(value: string): void {
    this.value = value;
  }
}

export class LightCheckbox implements Checkbox {
  private checked = false;

  render(): void {
    console.log(`Renderizando checkbox CLARO (${this.checked ? "marcado" : "desmarcado"})`);
  }

  check(): void {
    this.checked = true;
  }

  uncheck(): void {
    this.checked = false;
  }
}
