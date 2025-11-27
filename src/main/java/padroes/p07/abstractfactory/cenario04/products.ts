export interface Button {
  render(): void;
  onClick(handler: () => void): void;
}

export interface TextInput {
  render(): void;
  setValue(value: string): void;
}

export interface Checkbox {
  render(): void;
  check(): void;
  uncheck(): void;
}
