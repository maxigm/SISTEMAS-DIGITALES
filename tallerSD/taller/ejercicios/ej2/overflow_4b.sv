module overflow_4b (
    input logic [3:0] a, b, sum,
    output logic overflow
);
  // COMPLETAR: implementar el flag indicado en el ENUNCIADO.

assign overflow = ((a[3] & b[3]) & ~sum[3]);

endmodule
