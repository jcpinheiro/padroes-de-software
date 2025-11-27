import { Button, TextInput, Checkbox } from "./products";
import { LightButton, LightTextInput, LightCheckbox } from "./lightTheme";
import { DarkButton, DarkTextInput, DarkCheckbox } from "./darkTheme";

export interface UIFactory {
  createButton(): Button;
  createTextInput(): TextInput;
  createCheckbox(): Checkbox;
}

export class LightUIFactory implements UIFactory {
  createButton(): Button {
    return new LightButton();
  }

  createTextInput(): TextInput {
    return new LightTextInput();
  }

  createCheckbox(): Checkbox {
    return new LightCheckbox();
  }
}

export class DarkUIFactory implements UIFactory {
  createButton(): Button {
    return new DarkButton();
  }

  createTextInput(): TextInput {
    return new DarkTextInput();
  }

  createCheckbox(): Checkbox {
    return new DarkCheckbox();
  }
}
