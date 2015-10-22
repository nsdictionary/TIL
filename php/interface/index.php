<?
require 'documentable.php';
require 'document_store.php';
require 'html_document.php';
require 'stream_document.php';
require 'command_output_document.php';

$documentStore = new DocumentStore();

// add html document
$htmlDoc = new HtmlDocument('http://php.net');
$documentStore->addDocument($htmlDoc);

// add stream document
$streamDoc = new StreamDocument(fopen('stream.txt', 'rb'));
$documentStore->addDocument($streamDoc);

// add command document
$cmdDoc = new CommandOutputDocument('ls -al');
$documentStore->addDocument($cmdDoc);

print_r($documentStore->getDocuments());