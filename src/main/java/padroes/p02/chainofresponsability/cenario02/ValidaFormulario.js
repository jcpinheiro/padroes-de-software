class Validator {
    setNext(next) {
        this.next = next;
        return next;
    }

    validate(data) {
        if (this.next) return this.next.validate(data);
        return true;
    }
}

class EmailValidator extends Validator {
    validate(data) {
        if (!data.email.includes("@")) {
            console.log("Email inválido!");
            return false;
        }
        return super.validate(data);
    }
}

class PasswordValidator extends Validator {
    validate(data) {
        if (data.senha.length < 6) {
            console.log("Senha muito curta!");
            return false;
        }
        return super.validate(data);
    }
}

const email = new EmailValidator();
const senha = new PasswordValidator();

email.setNext(senha);

const user = { email: "joao", senha: "123" };
email.validate(user);
