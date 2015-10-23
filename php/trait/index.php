<?php
require 'vendor/autoload.php';
require 'geocodable.php';
require 'retail_store.php';

$geocoderAdapter = new \Geocoder\HttpAdapter\CurlHttpAdapter();
$geocoderProvider = new \Geocoder\Provider\GoogleMapsProvider($geocoderAdapter);
$geocoder = new \Geocoder\Geocoder($geocoderProvider);

$store = new RetailStore();
// $store->setAddress('420 9th Avenue, New York, NY 10001 USA');
$store->setAddress('Seoul, Korea');
$store->setGeocoder($geocoder);

$latitude = $store->getLatitude();
$longitude = $store->getLongitude();

echo $latitude, ':', $longitude;
