package com.bosonit.formacion.block7crudvalidation;

import java.util.Date;

public class EntidadNoEncontrada extends RuntimeException{

        private ErrorPersonalizado customError;

        public void EntityNotFoundException (String mensaje) {
            this.customError = new ErrorPersonalizado();
            this.customError.setTimestamp(new Date());
            this.customError.setHttpCode(404);
            this.customError.setMensaje(mensaje);
        }

        public ErrorPersonalizado getCustomError() {
            return customError;
        }
    }

