#!/bin/bash

ARQ=`basename $1|sed "s/\.cmm//"`

java Parser testes/$ARQ.cmm > testes/$ARQ.s
# 32 bits
# as -o $ARQ.o $ARQ.s
#ld -o $ARQ   $ARQ.o

# 64 bits 
as --32 -o testes/$ARQ.o testes/$ARQ.s
ld -m elf_i386 -s -o testes/$ARQ   testes/$ARQ.o
