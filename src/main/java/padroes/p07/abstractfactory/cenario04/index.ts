import { UIFactory, LightUIFactory, DarkUIFactory } from "./factory";

function renderLoginScreen(factory: UIFactory) {
  const title = "Tela de Login";

  const button = factory.createButton();
  const input = factory.createTextInput();
  const checkbox = factory.createCheckbox();

  console.log(`=== ${title} ===`);
  input.setValue("usuario@ifma.edu.br");
  checkbox.check();

  input.render();
  checkbox.render();
  button.render();

  button.onClick(() => {
    console.log("Botão de login clicado!");
  });
}

function main() {
  const theme: "light" | "dark" = "dark"; // altere aqui para "light" ou "dark"

  let factory: UIFactory;

  if (theme === "light") {
    factory = new LightUIFactory();
  } else {
    factory = new DarkUIFactory();
  }

  renderLoginScreen(factory);
}

main();
