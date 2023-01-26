<?php
    defined('BASEPATH') OR exit('No direct script access allowed');
    if ( ! function_exists('css_url')){
        function css_url($lien){
            return site_url("../assets/css/".$lien);
        }
    }

    if ( ! function_exists('js_url')){
        function js_url($lien){
            return site_url("../assets/js/".$lien);
        }
    }
    if ( ! function_exists('img_url')){
        function img_url($lien){
            return site_url("../assets/img/".$lien);
        }
    }
    if ( ! function_exists('bundles_url')){
        function bundles_url($lien){
            return site_url("../assets/bundles/".$lien);
        }
    }
    if ( ! function_exists('fonts_url')){
        function fonts_url($lien){
            return site_url("../assets/fonts/".$lien);
        }
    }
?>    