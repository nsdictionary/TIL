<?
function getRows($file){
  $handle = fopen($file, 'rb');
  if($handle === FALSE){
    throw new Exception();
  }

  while(feof($handle) === FALSE){
    yield fgetcsv($handle);
  }

  fclose($handle);
}

foreach(getRows('data.csv') as $row){
  print_r($row);
}