<?
function enclosePerson($name){
  return function($doCommand) use ($name){
    return sprintf('%s, %s', $name, $doCommand);
  };
}

$clay = enclosePerson('Clay');
echo $clay('차 한잔 부탁해요!');