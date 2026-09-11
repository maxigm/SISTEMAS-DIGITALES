module zero_4b (
    input logic [3:0] dato,
    output logic zero
);
  // COMPLETAR: Indicar si dato es cero.

  assign zero = (((~dato[0] & ~dato[1]) & ~dato[2]) & ~dato[3]);
endmodule
