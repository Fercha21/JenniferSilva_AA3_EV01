package com.evidenciaspring.evidenciaspring.controllers;

import java.time.LocalDateTime;

public class InformacionAprendiz {

        private LocalDateTime Time;
        private String NombreAprendiz;
        private String ApellidoAprendiz;
        private String FichaAprendiz;

        public InformacionAprendiz() {
        }

        public InformacionAprendiz(LocalDateTime Time, String nombreAprendiz, String apellidoAprendiz,
                        String fichaAprendiz) {
                this.Time = Time;
                this.NombreAprendiz = nombreAprendiz;
                this.ApellidoAprendiz = apellidoAprendiz;
                this.FichaAprendiz = fichaAprendiz;
        }

        public LocalDateTime getTime() {
                return Time;
        }

        public String getNombreAprendiz() {
                return NombreAprendiz;
        }

        public String getApellidoAprendiz() {
                return ApellidoAprendiz;
        }

        public String getFichaAprendiz() {
                return FichaAprendiz;
        }

        public void setTime(LocalDateTime time) {
                Time = time;
        }

        public void setNombreAprendiz(String nombreAprendiz) {
                NombreAprendiz = nombreAprendiz;
        }

        public void setApellidoAprendiz(String apellidoAprendiz) {
                ApellidoAprendiz = apellidoAprendiz;
        }

        public void setFichaAprendiz(String fichaAprendiz) {
                FichaAprendiz = fichaAprendiz;
        }

}
